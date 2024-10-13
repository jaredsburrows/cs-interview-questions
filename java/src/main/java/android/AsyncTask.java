package android;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public abstract class AsyncTask<Params, Progress, Result> {
    private final ExecutorService service = Executors.newFixedThreadPool(5);
    private final WorkerRunnable<Params, Result> workerRunnable;
    private final FutureTask<Result> futureTask;

    public AsyncTask() {
        onPreExecute();

        workerRunnable = new WorkerRunnable<>() {
            @Override
            public Result call() throws Exception {
                Result result = null;
                try {
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

        futureTask = new FutureTask<>(workerRunnable) {
            @Override
            protected void done() {
                try {
                    onPostExecute(get());
                } catch (InterruptedException e) {
                    System.out.println("Error");
                } catch (ExecutionException e) {
                    throw new RuntimeException("An error occurred while executing doInBackground()",
                        e);
                } finally {
                    onPostExecute(null);
                }
            }
        };
    }

    protected void onPreExecute() {
    }

    @SuppressWarnings("unchecked")
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
