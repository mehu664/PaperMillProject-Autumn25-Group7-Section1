package cse213.group7.papermillfinal.meher;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendalebObjectOutputStream extends ObjectOutputStream {
    public AppendalebObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() {
        //
    }
}

