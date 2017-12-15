package me.tnsi.scratchpad.migrations

import io.realm.DynamicRealm
import io.realm.RealmMigration
import io.realm.RealmSchema

class Migrations : RealmMigration {
    override fun migrate(realm: DynamicRealm, _oldVersion: Long, _newVersion: Long) {
        var schema: RealmSchema = realm.schema
        var oldVersion = _oldVersion

        /*
        if (oldVersion == 0) {
            schema.create("Object")
                    .addField("something", String.javaClass)
            oldVersion++
        }
        */
    }
}