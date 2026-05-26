package fixio.examples.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public abstract class AbstractQuoteStreamingWorker implements Runnable {

    private static final int BUFFER_LENGTH = 32;

    private final BlockingQueue<Quote> quoteQueue;

    public AbstractQuoteStreamingWorker(BlockingQueue<Quote> quoteQueue) {
        this.quoteQueue = quoteQueue;
    }

    protected abstract void sendQuotes(List<Quote> buffer);

    @Override
    public void run() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
