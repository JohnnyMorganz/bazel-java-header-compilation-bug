package com.example.consumer;

import com.example.extension.*;
import com.example.library2.*;

class ActualUser extends User {
    @Override
    public Pair<String, String> getUser() {
        return new Pair<String, String>("c", "d");
    }
}
