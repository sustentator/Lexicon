package latinitatis.lexicon.activity;

import latinitatis.lexicon.R;

public class SyncActivity extends AbstractActivity {

    @Override
    protected int title() {
        return R.string.renew;
    }

    @Override
    protected int layout() {
        return R.layout.activity_sync;
    }
}
