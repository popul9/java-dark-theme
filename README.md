# Java Dark Theme

> An IntelliJ-inspired dark theme for Java and Kotlin in VS Code

A carefully crafted dark color theme for Visual Studio Code, inspired by the aesthetics of IntelliJ IDEA's Dark theme. It aims to replicate the familiar look and feel as closely as possible — but it is **not a pixel-perfect copy**. Some elements may appear slightly different due to how VS Code's TextMate and semantic token engines work. For example, Spring Boot annotations, custom annotations, and certain language-specific constructs may render with slightly different colors compared to IntelliJ. Overall, it should feel very familiar to IntelliJ users.

## Features

- **IntelliJ Dark-inspired colors** — Classic dark background with soft, eye-friendly syntax highlighting
- **Java and Kotlin-optimized** — Semantic highlighting for classes, methods, annotations, and more
- **Annotation highlighting** — `@RestController`, `@PostMapping`, etc. in signature yellow (`#BBB529`)
- **Keyword styling** — `public`, `private`, `return`, `class` in warm orange (`#CC7832`)
- **String literals** — Green (`#6A8759`) just like IntelliJ
- **Method declarations** — Blue (`#56A8F5`) to distinguish definitions from calls
- **Full workbench theming** — Activity bar, sidebar, tabs, terminal, and more
- **Multi-language support** — Also includes styles for JSON, YAML, XML, Markdown, and Properties files

## Color Palette

| Element               | Color         |
| --------------------- | ------------- |
| Background            | `#1E1E1E`     |
| Foreground / Text     | `#A9B7C6`     |
| Keywords              | `#CC7832`     |
| Strings               | `#6A8759`     |
| Annotations           | `#BBB529`     |
| Numbers               | `#6897BB`     |
| Method declarations   | `#56A8F5`     |
| Constants             | `#9876AA`     |
| Comments              | `#808080`     |
| Javadoc               | `#629755`     |

## Installation

1. Open **VS Code**
2. Go to **Extensions** (`Cmd+Shift+X` / `Ctrl+Shift+X`)
3. Search for **"Java Dark Theme"**
4. Click **Install**
5. Press `Cmd+K Cmd+T` / `Ctrl+K Ctrl+T` and select **Java Dark Theme**

## Recommended Settings

For the best experience, add these to your `settings.json`:

```json
{
  "[java]": {
    "editor.fontFamily": "'JetBrains Mono', monospace",
    "editor.fontLigatures": true,
    "editor.semanticHighlighting.enabled": true
  },
  "[kotlin]": {
    "editor.fontFamily": "'JetBrains Mono', monospace",
    "editor.fontLigatures": true,
    "editor.semanticHighlighting.enabled": true
  }
}
```

## Alternative: Manual Configuration

If you prefer not to install the extension, you can add the following directly to your `settings.json` (`Cmd+Shift+P` / `Ctrl+Shift+P` → "Preferences: Open User Settings (JSON)"):

```jsonc
{
    "[java]": {
        "editor.fontFamily": "'JetBrains Mono', monospace",
        "editor.fontLigatures": true,
        "editor.semanticHighlighting.enabled": true
    },
    "[kotlin]": {
        "editor.fontFamily": "'JetBrains Mono', monospace",
        "editor.fontLigatures": true,
        "editor.semanticHighlighting.enabled": true
    },
    "editor.semanticTokenColorCustomizations": {
        "rules": {
            "class:java": { "foreground": "#A9B7C6" },
            "type:java": { "foreground": "#A9B7C6" },
            "interface:java": { "foreground": "#A9B7C6" },
            "enum:java": { "foreground": "#A9B7C6" },
            "namespace:java": { "foreground": "#A9B7C6" },
            "method:java": { "foreground": "#A9B7C6" },
            "function:java": { "foreground": "#A9B7C6" },
            "parameter:java": { "foreground": "#A9B7C6" },
            "property:java": { "foreground": "#A9B7C6" },
            "variable:java": { "foreground": "#A9B7C6" },
            "annotation:java": { "foreground": "#BBB529" },
            "annotationType:java": { "foreground": "#BBB529" },
            "class.annotation:java": { "foreground": "#BBB529" },
            "type.annotation:java": { "foreground": "#BBB529" },
            "interface.annotation:java": { "foreground": "#BBB529" },
            "method.declaration:java": { "foreground": "#56A8F5" },
            "function.declaration:java": { "foreground": "#56A8F5" },

            "class:kotlin": { "foreground": "#A9B7C6" },
            "type:kotlin": { "foreground": "#A9B7C6" },
            "interface:kotlin": { "foreground": "#A9B7C6" },
            "enum:kotlin": { "foreground": "#A9B7C6" },
            "namespace:kotlin": { "foreground": "#A9B7C6" },
            "method:kotlin": { "foreground": "#A9B7C6" },
            "function:kotlin": { "foreground": "#A9B7C6" },
            "parameter:kotlin": { "foreground": "#A9B7C6" },
            "property:kotlin": { "foreground": "#A9B7C6" },
            "variable:kotlin": { "foreground": "#A9B7C6" },
            "annotation:kotlin": { "foreground": "#BBB529" },
            "annotationType:kotlin": { "foreground": "#BBB529" },
            "class.annotation:kotlin": { "foreground": "#BBB529" },
            "type.annotation:kotlin": { "foreground": "#BBB529" },
            "interface.annotation:kotlin": { "foreground": "#BBB529" },
            "method.declaration:kotlin": { "foreground": "#56A8F5" },
            "function.declaration:kotlin": { "foreground": "#56A8F5" }
        }
    },
    "editor.tokenColorCustomizations": {
        "textMateRules": [
            {
                "scope": [
                    "entity.name.type.java",
                    "storage.type.java",
                    "entity.other.inherited-class.java",
                    "entity.name.type.kotlin",
                    "storage.type.kotlin",
                    "entity.other.inherited-class.kotlin"
                ],
                "settings": { "foreground": "#A9B7C6" }
            },
            {
                "scope": [
                    "storage.type.annotation.java",
                    "punctuation.definition.annotation.java",
                    "entity.name.type.annotation.java",
                    "meta.declaration.annotation.java entity.name.type.class.java",
                    "meta.declaration.annotation.java entity.name.type.java",
                    "meta.annotation.java entity.name.type.class.java",
                    "meta.annotation.java entity.name.type.java",
                    "meta.annotation.java entity.name.type",
                    "meta.annotation.java entity.name.type.interface.java",
                    "storage.type.annotation.kotlin",
                    "punctuation.definition.annotation.kotlin",
                    "entity.name.type.annotation.kotlin",
                    "meta.annotation.kotlin entity.name.type.class.kotlin",
                    "meta.annotation.kotlin entity.name.type.kotlin"
                ],
                "settings": { "foreground": "#BBB529" }
            },
            {
                "scope": [
                    "keyword.control.java",
                    "keyword.operator.java",
                    "storage.modifier.java",
                    "storage.type.primitive.java",
                    "keyword.control.kotlin",
                    "keyword.operator.kotlin",
                    "storage.modifier.kotlin",
                    "storage.type.builtin.kotlin"
                ],
                "settings": { "foreground": "#CC7832" }
            },
            {
                "scope": [
                    "keyword.other.import.java",
                    "keyword.other.package.java",
                    "keyword.other.import.kotlin",
                    "keyword.other.package.kotlin"
                ],
                "settings": { "foreground": "#CC7832" }
            },
            {
                "scope": [
                    "string.quoted.double.java",
                    "string.quoted.double.kotlin",
                    "string.quoted.single.kotlin",
                    "string.template.kotlin"
                ],
                "settings": { "foreground": "#6A8759" }
            },
            {
                "scope": [
                    "constant.language.java",
                    "constant.language.kotlin"
                ],
                "settings": { "foreground": "#CC7832", "fontStyle": "bold" }
            },
            {
                "scope": [
                    "constant.numeric.java",
                    "constant.numeric.integer.kotlin",
                    "constant.numeric.float.kotlin",
                    "constant.numeric.long.kotlin",
                    "constant.numeric.double.kotlin"
                ],
                "settings": { "foreground": "#6897BB" }
            },
            {
                "scope": [
                    "source.java",
                    "source.kotlin"
                ],
                "settings": { "foreground": "#A9B7C6" }
            }
        ]
    }
}
```

## Notes on IntelliJ Similarities & Differences

This theme is **inspired by** IntelliJ IDEA's Dark theme, but there are some known differences:

- **Spring Boot & framework annotations** (e.g. `@SpringBootApplication`, `@Autowired`) may appear white instead of yellow in some situations, depending on how the Java language server resolves them.
- **Custom annotations** you define yourself may not always be highlighted in yellow — this depends on VS Code's semantic token support.
- **Method call colors** differ slightly: IntelliJ does not color regular method calls, but some are colored differently here depending on the TextMate grammar resolution.
- **Overall feel** is very close to IntelliJ, especially for standard Java/Kotlin syntax.

## Screenshots

*Coming soon*
