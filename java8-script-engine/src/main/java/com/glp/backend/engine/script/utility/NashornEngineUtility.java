package com.glp.backend.engine.script.utility;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class NashornEngineUtility {

    private static ScriptEngineManager scriptEngineManager;
    private static final String SHORT_ENGINE_NAME = "nashorn";

    static {
        scriptEngineManager = new ScriptEngineManager();
    }

    /**
     * 执行脚本方法
     *
     * @param scriptFunctionName 脚本方法名称
     * @param expressionList     脚本方法参数
     * @param arguments          表达式的变量列表
     * @return 返回脚本方法的返回值
     */
    public static Object executeScriptFunction(String scriptFunctionName, List<ScriptCondition> expressionList, Map<String, Object> arguments) {
        try {
            InputStreamReader inStreamReader = new InputStreamReader(NashornEngineUtility.class.getResourceAsStream("/express.js"));
            /*char[] cbuf = new char[1024];
            int length;
            while ((length = inStreamReader.read(cbuf, 0, cbuf.length)) > 0) {
                String s = new String(cbuf, 0, length);
                System.out.print(s);
            }*/
            ScriptEngine engine = scriptEngineManager.getEngineByName(SHORT_ENGINE_NAME);
            engine.eval(inStreamReader);
            Invocable invocable = (Invocable) engine;
            for (Map.Entry<String, Object> entry : arguments.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String valueStr = String.valueOf(value).trim();
                if (value == null || "NULL".equalsIgnoreCase(valueStr) || "NaN".equalsIgnoreCase(valueStr) || "".equals(valueStr)) {
                    value = null;
                }
                engine.put(key, value);
            }
            return invocable.invokeFunction(scriptFunctionName, expressionList);
        } catch (ScriptException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 执行脚本表达式
     *
     * @param scriptString 脚本表达式的字符串
     * @param arguments    脚本表达式的变量列表
     * @return 返回脚本表达式的执行结果
     */
    public static Object executeScriptString(String scriptString, Map<String, Object> arguments) {
        try {
            ScriptEngine engine = scriptEngineManager.getEngineByName(SHORT_ENGINE_NAME);
            for (Map.Entry<String, Object> entry : arguments.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String valueStr = String.valueOf(value).trim();
                if (value == null || "NULL".equalsIgnoreCase(valueStr) || "NaN".equalsIgnoreCase(valueStr) || "".equals(valueStr)) {
                    value = null;
                }
                engine.put(key, value);
            }
            return engine.eval(scriptString);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 执行常量表达式(表达式中不包含变量)
     *
     * @param scriptConstantExpression 常量表达式的字符串
     * @return 返回常量表达式的执行结果
     */
    public static Object executeScriptConstantExpression(String scriptConstantExpression) {
        try {
            ScriptEngine engine = scriptEngineManager.getEngineByName(SHORT_ENGINE_NAME);
            return engine.eval(scriptConstantExpression);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }

    public static class ScriptCondition {

        private String uniqueCode;
        private String expressionContent;
        private Boolean result;
        private String exception;

        public String getUniqueCode() {
            return uniqueCode;
        }

        public void setUniqueCode(String uniqueCode) {
            this.uniqueCode = uniqueCode;
        }

        public String getExpressionContent() {
            return expressionContent;
        }

        public void setExpressionContent(String expressionContent) {
            this.expressionContent = expressionContent;
        }

        public Boolean getResult() {
            return result;
        }

        public void setResult(Boolean result) {
            this.result = result;
        }

        public void setResult(String result) {
            this.result = Boolean.valueOf(result);
        }

        public String getException() {
            return exception;
        }

        public void setException(String exception) {
            this.exception = exception;
        }
    }
}
