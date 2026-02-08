// ItemActionManager.java

package com.example.plugin.actions;

import java.util.HashMap;
import java.util.Map;

public class ItemActionManager {
    private Map<String, Runnable> actions;

    public ItemActionManager() {
        actions = new HashMap<>();
    }

    public void registerAction(String actionName, Runnable action) {
        actions.put(actionName, action);
    }

    public void executeAction(String actionName) {
        Runnable action = actions.get(actionName);
        if (action != null) {
            action.run();
        } else {
            System.out.println("Action not found: " + actionName);
        }
    }
}