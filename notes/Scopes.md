
Bean Scopes
===========

<pre><code>
    +----------------+-------------------------------------------------------------------+
    | Scope          | Description                                                       |
    +----------------+-------------------------------------------------------------------+
    | singleton      | Create a single shared instance of the bean (this is the default) |
    +----------------+-------------------------------------------------------------------+
    | prototype      | Creates a new bean instance for each container request            |
    +----------------+-------------------------------------------------------------------+
    | request        | Scoped to an HTTP web request, only used for web apps             |
    +----------------+-------------------------------------------------------------------+
    | session        | Scoped to an HTTP web session, only used for web apps             |
    +----------------+-------------------------------------------------------------------+
    | global-session | Scoped to a global HTTP web session, only used for web apps       |
    +----------------+-------------------------------------------------------------------+
</code></pre>

In order to specify the scope you need to add it like this:

*WARNING* Beans with scope of prototype don't have the destroy-method called upon them, you need to do this manually

<bean id="bla"
    class="org.neurosys.learnspring.myclass"
    scope="prototype"
</bean>
