package architecture.mvp;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public interface Contract {
    // Activity/Fragment/View
    interface View {
        void setPresenter(Presenter presenter);

        void showEmptyTaskError();

        void showEmptyTaskSuccess();

        void setTitle(String title);
    }

    // 1 per Activity/Fragment/View
    interface Presenter {
        boolean isDataMissing();

        void saveTask(String title);
    }
}
