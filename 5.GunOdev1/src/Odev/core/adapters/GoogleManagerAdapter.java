package Odev.core.adapters;

import Odev.core.abstracts.GoogleService;
import Odev.Google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {
    @Override
    public void registerToSystem() {
        GoogleManager googleManager = new GoogleManager();
        googleManager.register();

    }

}
