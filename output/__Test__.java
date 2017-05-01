import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import Map.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        lispioninhaS_orientadaLexer lex = new lispioninhaS_orientadaLexer(new ANTLRFileStream("/home/gian/Programs/Antlrworks/trabalho/lispioninha/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        lispioninhaS_orientadaParser g = new lispioninhaS_orientadaParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}