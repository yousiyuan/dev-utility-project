// var ArrayList = Java.type("java.util.ArrayList");
// var Integer = Java.type('java.lang.Integer');

var executeCondition = function (arguments) {
    for (var i = 0; i < arguments.size(); i++) {
        var argObj = arguments[i];
        try {
            if (eval(argObj.getExpressionContent())) {
                argObj.setResult("true");
            } else {
                argObj.setResult("false");
            }
        } catch (e) {
            argObj.setException(e.toString());
        }
    }
    return arguments;
};



/*
importPackage("java.lang.Integer");
importClass("");
var SwingGui = new JavaImporter(javax.swing,
    javax.swing.event,
    javax.swing.border,
    java.awt.event);
with (SwingGui) {
    // 在这个'with'语句中，我们可以通过不合格（简单的，直接调用类名）的名字访问Swing和AWT类。
    var mybutton = new JButton("test");
    var myframe = new JFrame("test");
}
*/