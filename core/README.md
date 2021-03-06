
# WIP Project. This lays out what I'm planning and that can be done within a decent amount of time.

All features here were working when they are added, and are tested in the example project. Any changes may or may not be
reflected in this README, and suggestions on API changes are always welcome

TODO:

MinecraftCommand:

- playerRunner
- Command parameters

ConfigValue:

- Implementation

Future:

- TranslatedValue
    - String field has the value of the translation key, independent library is shaded/used in tandem with code
      generation for E18N with YML.

# Messages

All messages (such as error messages) default to a message in the case used for static final fields, ex: ERROR_MESSAGE.
This is meant for a future localization system implemented into this project.

# Annotations

<ul>
<li><a href="#plugin-main">PluginMain</a></li>
<li><a href="#plugin-listener">PluginListener</a></li>
<li><a href="#minecraft-command">MinecraftCommand</a></li>
</ul>
<h3 id="plugin-main">PluginMain</h3>

!! This annotation is required !!

PluginMain defines the main attributes of the plugin, used to generate a plugin.yml With this anotation, __There is no
need to make a plugin.yml yourself__

<table>
    <tr>
        <th>Field Name</th>
        <th>Description</th>
    </tr>
    <tr>
        <th>name</th>
        <th>Name of the plugin. The plugin name should be like this: ExamplePlugin. Keep it short and sweet.</th>
    </tr>
    <tr>
        <th>version</th>
        <th>Plugin version, in the format: (major-version.minor-version.patch)
            <br>Major version changes add/remove features, minor version changes may change features or some API points, patches are bug fixes with no features.</th>
    </tr>
    <tr>
        <th>description</th>
        <th>A quick plugin description</th>
    </tr>
    <tr>
        <th>author</th>
        <th>Author shown, sometimes used in error messages. An email address is recommended (if not, Discord ID or Spigot forum username works)</th>
    </tr>
    <tr>
        <th>apiVersion</th>
        <th>Spigot API version. Not having this value makes Spigot load the plugin with backwards-compatibility</th>
    </tr>
    <tr>
        <th>load</th>
        <th>Loading time of the plugin. Default is POSTWORLD (after the world is loaded), you can also use STARTUP (server start)</th>
    </tr>
    <tr>
        <th>authors</th>
        <th>List of authors, an email address is recommended (if not, Discord ID or Spigot forum username works)<br>Should not be used with author</th>
    </tr>
    <tr>
        <th>website</th>
        <th>Website of the project</th>
    </tr>
    <tr>
        <th>depend</th>
        <th>Names of plugins needed, for example: ProtocolLib, Vault, etc...</th>
    </tr>
    <tr>
        <th>prefix</th>
        <th>Prefix added to the logger of the plugin</th>
    </tr>
    <tr>
        <th>softDepend</th>
        <th>Plugins that aren't necessary to use the plugin, but may be used by the plugin.</th>
    </tr>
    <tr>
        <th>loadBefore</th>
        <th>Any plugins that should be loaded AFTER your plugin loads.</th>
    </tr>
</table>

<h3 id="plugin-listener">PluginListener</h3>

PluginListener defines a single listener. Listeners are automatically registered.

<h3 id="minecraft-command">MinecraftCommand</h3>

MinecraftCommand defines a single command. Commands are automatically registered.

Fields:

<table>
    <tr>
        <th>Field Name</th>
        <th>Description</th>
    </tr>
    <tr>
        <th>name</th>
        <th>Command description for the /help menu</th>
    </tr>
    <tr>
        <th>aliases</th>
        <th>All aliases of the command. If the aliases are "hi" and "hello", running /hi or /hello runs the command</th>
    </tr>
    <tr>
        <th>playerRunner</th>
        <th>If the command runner should be a player. If true, don't override and replace CommandSender with Player.</th>
    </tr>
    <tr>
        <th>permission</th>
        <th>see <a href="#spigot-permission">SpigotPermission</a></th>
    </tr>
    <tr>
        <th>permissionError</th>
        <th>Message if the user doesn't have permission to run the command.</th>
    </tr>
    <tr>
        <th>wrongUserError</th>
        <th>Message if the wrong type of user uses the message (The console if playerRunner is true)</th>
    </tr>
    <tr>
        <th>usage</th>
        <th>Message sent if false is returned from the command</th>
    </tr>
</table>

WIP FEATURE:
onCommand is not overriding, and follows the same parameters except args can be replaced with the exact arguments you
want to use.

Vargs are planned to be allowed.

Error messages follow the following keys:

Annotations are allowed to restrict certain types:
<table>
    <tr>
        <th>Annotation</th>
        <th>Arguments</th>
    </tr>
    <tr>
        <th>IntegerParameter</th>
        <th>Minimum: Min value<br>Maximum: Max value</th>
    </tr>
    <tr>
        <th>PlayerParameter</th>
        <th>Allow Selectors: Allows to @p and @r selectors.
            <br>Allow Multiple: Allows the @a selector. Player parameter SHOULD BE AN ARRAY.</th>
    </tr>
    <tr>
        <th>EntityParameter</th>
        <th>Allow Selectors: Allows to @p and @r selectors.
            <br>Allow Multiple: Allows the @a and @e selector. Entity parameter SHOULD BE AN ARRAY.
            <br>Will automatically cast Entity subclass to any superclass you put.</th>
    </tr>
    <tr>
        <th>WorldParameter</th>
        <th>Environment: Requires the argument world to have the given environment
            <br>World Error Message: Error shown when no world is found with the name
            <br>Environment Error Message: Error shown when the world has the wrong environment</th>
    </tr>
</table>

<h3 id="spigot-permission">SpigotPermission</h3>

<h3 id="config-value">ConfigValue</h3>
