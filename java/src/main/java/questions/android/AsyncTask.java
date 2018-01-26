package questions.android;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@SuppressWarnings("unchecked")
public abstract class AsyncTask<Params, Progress, Result> {
    private ExecutorService service = Executors.newFixedThreadPool(5);
    private final WorkerRunnable<Params, Result> workerRunnable;
    private final FutureTask<Result> futureTask;

    public AsyncTask() {
        workerRunnable = new WorkerRunnable<Params, Result>() {
            @Override
            public Result call() throws Exception {
                Result result = null;
                try {
                    onPreExecute();
                    result = doInBackground(params);
                } catch (Throwable tr) {
                    cancel();
                    throw tr;
                } finally {
                    onPostExecute(result);
                }
                return result;
            }
        };

        futureTask = new FutureTask<Result>(workerRunnable) {
            @Override
            protected void done() {
                try {
                    onPostExecute(get());
                } catch (InterruptedException e) {
                    System.out.println("Error");
                } catch (ExecutionException e) {
                    throw new RuntimeException("An error occurred while executing doInBackground()",
                        e.getCause());
                } finally {
                    onPostExecute(null);
                }
            }
        };
    }

    protected void onPreExecute() {
    }

    protected abstract Result doInBackground(Params... params);

    protected void onPostExecute(Result result) {
    }

    public void cancel() {
        service.shutdown();
    }

    private static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {
        Params[] params;
    }
}
