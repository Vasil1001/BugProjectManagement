package com.BugTrackerApp.BugTracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(value="/we")
    public static String welcome1() {
        return ("Welcome to Spring Boot - Welcome Controller");
    }

    @RequestMapping(value="/")
    public static String index() {
        return "projects/getAll";
    }
}



//   # Database
//           spring.datasource.driverClassName = com.mysql.jdbc.Driver
//           spring.datasource.url = jdbc:mysql://localhost:3306/logparser
//           spring.datasource.username = root
//           spring.datasource.password = root
//
//           spring.jpa.database = MYSQL
//           spring.jpa.show-sql = true
//
//           # Hibernate
//           hibernate.dialect: org.hibernate.dialect.MySQL5Dialect
//           hibernate.show_sql: true
//           hibernate.hbm2ddl.auto: update
//           entitymanager.packagesToScan: /



//<hibernate-configuration>
//<session-factory>
//<!-- Database connection settings -->
//<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
//<!-- property name="connection.driver_class">com.mysql.jdbc.Driver</property  com.mysql.cj.jdbc.Driver -->
//<property name="connection.url">jdbc:mysql://localhost:3306/test</property>
//<property name="connection.username">root</property>
//<property name="connection.password">mypassword</property>
//
//<!-- JDBC connection pool (use the built-in) -->
//<property name="connection.pool_size">1</property>
//
//<!-- SQL dialect -->
//<!--<property name="dialect">org.hibernate.dialect.MySQLDialect</property>-->
//<property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>
//
//<!-- Disable the second-level cache -->
//<property name="cache.provider_class">org.hibernate.cache.internal.NoCacheProvider</property>
//
//<!-- Echo all executed SQL to stdout -->
//<property name="show_sql">true</property>
//<property name="format_sql">true</property>
//
//<property name="current_session_context_class">thread</property>
//
//<!-- Drop and re-create the database schema on startup -->
//<property name="hbm2ddl.auto">update</property>
//
//<!-- Names the annotated entity class -->
//<mapping class="org.test.connection.UserDetails" />
//
//</session-factory>
//
//</hibernate-configuration>