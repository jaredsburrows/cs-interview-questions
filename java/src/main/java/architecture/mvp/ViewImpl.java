package architecture.mvp;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class ViewImpl implements Contract.View {
    private Contract.Presenter presenter;
    private String title;

    @Override
    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showEmptyTaskError() {
        System.out.println("Error!");
    }

    @Override
    public void showEmptyTaskSuccess() {
        System.out.println("Success!");
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
