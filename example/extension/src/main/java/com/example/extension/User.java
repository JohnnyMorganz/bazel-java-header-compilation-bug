package com.example.extension;

import com.example.library1.*;
import com.example.library2.*;

public abstract class User {
    public Pair<String, String> getUser() {
        return new Pair<String, String>("a", "b");
    }
}
