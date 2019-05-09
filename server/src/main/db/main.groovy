databaseChangeLog {
  changeSet(id: '1557320751826-1', author: 'ehield (generated)') {
    createTable(tableName: 'hats') {
      column(name: 'id', type: 'VARCHAR(64)') {
        constraints(primaryKey: true)
      }
      column(name: 'name', type: 'VARCHAR(64)') {
        constraints(nullable: false)
      }
      column(name: 'in_use', type: 'BIT(1)', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1557320751826-2', author: 'ehield (generated)') {
    createTable(tableName: 'items') {
      column(name: 'id', type: 'VARCHAR(64)') {
        constraints(primaryKey: true)
      }
      column(name: 'consumable', type: 'BIT(1)', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'user_id', type: 'VARCHAR(64)') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(64)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1557320751826-3', author: 'ehield (generated)') {
    createTable(tableName: 'users') {
      column(name: 'id', type: 'VARCHAR(64)') {
        constraints(primaryKey: true)
      }
      column(name: 'host', type: 'VARCHAR(64)')
      column(name: 'colour', type: 'VARCHAR(7)', defaultValue: '0') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(100)', defaultValue: '0') {
        constraints(nullable: false)
      }
      column(name: 'current_points', type: 'INT', defaultValueNumeric: 0) {
        constraints(nullable: false)
      }
      column(name: 'last_activity', type: 'timestamp', defaultValueComputed: 'NULL')
    }
  }

  changeSet(id: '1557320751826-4', author: 'ehield (generated)') {
    addColumn(tableName: 'users') {
      column(name: 'high_score', type: 'INT', defaultValueNumeric: 0)
    }
  }

}
