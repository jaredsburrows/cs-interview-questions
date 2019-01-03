package architecture.mvp;

import java.util.ArrayList;
import java.util.List;

public class PresenterImpl implements Contract.Presenter {
    private final List<String> tasks = new ArrayList<>();
    private final Contract.View view;

    public PresenterImpl(Contract.View view) {
        this.view = view;

        view.setPresenter(this);
    }

    @Override
    public boolean isDataMissing() {
        return tasks.isEmpty();
    }


    @Override
    public void saveTask(String title) {
        tasks.add(title);
    }
}
