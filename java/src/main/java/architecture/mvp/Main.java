package architecture.mvp;

public final class Main {
    public static void main(String[] args) throws Exception {
        ViewImpl view = new ViewImpl();
        PresenterImpl presenter = new PresenterImpl(view);

        view.setPresenter(presenter);
    }
}
