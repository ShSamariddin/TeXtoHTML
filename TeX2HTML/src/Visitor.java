public class Visitor extends TexBaseVisitor<String> {

    public String visitTexT(TexParser.TexTContext ctx) {
        System.out.println("entered function Tex");
        return visit(ctx.eq());
    }

    public String visitEqT(TexParser.EqTContext ctx) {
        System.out.println("entered function visitEqT");
        return "\n<mrow> " + visit(ctx.expression()) + " <mo> = </mo> " + visit(ctx.eq()) + " </mrow>";
    }

    public String visitEndeqT(TexParser.EndeqTContext ctx) {
        System.out.println("entered function visitEndeqT");

        return visit(ctx.expression());
    }
    public String visitChooseT(TexParser.ChooseTContext ctx){
        return "<mo>(</mo>\n" +
                "                    <mfrac linethickness=\"0\">\n" +
                "                        " + visit(ctx.expression(0)) + "\n" +
                "                        " + visit(ctx.expression(1)) + "\n" +
                "                    </mfrac>\n" +
                "                    <mo>)</mo>";
    }
    public String visitFracT(TexParser.FracTContext ctx) {
        System.out.println("entered function visitFracT");

        return "<mfrac> " + visit(ctx.expression(0)) + " " + visit(ctx.expression(1)) + " </mfrac>";
    }


    public String visitSqrtT(TexParser.SqrtTContext ctx) {
        if (ctx.SQUARE_OPEN() != null) {
            return "<mroot> " + visit(ctx.expression(0)) + " " + visit(ctx.expression(1)) + " </mroot>";
        }
        return "<msqrt> " + visit(ctx.expression(0)) + " </msqrt>";
    }

    public String visitSupsubT(TexParser.SupsubTContext ctx) {
        return "<msupsub> " + visit(ctx.expression(0)) + " " + visit(ctx.expression(1)) + " " + visit(ctx.expression(2)) + " </msupsub>";
    }

    public String visitSubsupT(TexParser.SubsupTContext ctx){
        return "<msubsup> " + visit(ctx.expression(0)) + " " + visit(ctx.expression(1)) + " " + visit(ctx.expression(2)) + " </msubsup>";
    }


    public String visitIndexT(TexParser.IndexTContext ctx){
        if (ctx.UP() != null)
            return "<msup> " + visit(ctx.expression(0)) + " " + visit(ctx.expression(1)) + " </msup>";
        if (ctx.DOWN() != null)
            return "<msub> " + visit(ctx.expression(0)) + " " + visit(ctx.expression(1)) + " </msub>";
        return "Exception in visitIndexT";
    }


    public String visitBrT(TexParser.BrTContext ctx){
        return "<mrow> <mo> ( </mo> " + visit(ctx.expression()) + " <mo> ) </mo> </mrow>";
    }

    public String visitMulDivT(TexParser.MulDivTContext ctx){
        if (ctx.MUL() !=  null)
        return "<mrow> " + visit(ctx.expression(0)) + " <mo> &times </mo> " + visit(ctx.expression(1)) + " </mrow>";
        if (ctx.DIV() != null)
        return "<mrow> " + visit(ctx.expression(0)) + " <mo> &divide </mo> " + visit(ctx.expression(1)) + " </mrow>";
        return "Exception in visitMulDivT";
    }
    public String  visitAddSubT(TexParser.AddSubTContext ctx){
        if (ctx.PLUS() != null)
        return "<mrow> " + visit(ctx.expression(0)) + " <mo> + </mo> " + visit(ctx.expression(1)) + " </mrow>";
        if (ctx.MINUS() != null)
        return "<mrow> " + visit(ctx.expression(0)) + " <mo> - </mo> " + visit(ctx.expression(1)) + " </mrow>";
        if (ctx.PLUS_MINUS() != null)
        return "<mrow> " + visit(ctx.expression(0)) + " <mo> &plusmn </mo> " + visit(ctx.expression(1)) + " </mrow>";
        return "Exception in visitAddSubT";
    }

    public String visitUnaryT(TexParser.UnaryTContext ctx){
        if (ctx.MINUS() != null)
        return "<mrow> <mo> - </mo> " + visit(ctx.expression()) + " </mrow>";
        if (ctx.PLUS_MINUS() != null)
        return "<mrow> <mo> &plusmn </mo> " + visit(ctx.expression()) + " </mrow>";
        return "Exception in visitUnaryT";
    }
    public String  visitAtomT(TexParser.AtomTContext ctx){
        if (ctx.NUMBER() != null)
        return "<mn> " + ctx.getText() + " </mn>";
        if (ctx.WORD() != null)
        return "<mi> " + ctx.getText() + " </mi>";
        return "Exception in visitAtomT";
    }
}
