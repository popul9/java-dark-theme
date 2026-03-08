# Java Dark Theme

> IntelliJ-Inspired dark theme for Java and Kotlin

A carefully crafted dark color theme for Visual Studio Code that brings the familiar aesthetics of IntelliJ IDEA's Darcula theme to your Java and Kotlin development workflow.

## Features

- **Darcula-style colors** — Classic dark background (`#2B2B2B`) with soft, eye-friendly syntax highlighting
- **Java and Kotlin-optimized** — Semantic highlighting for Java and Kotlin classes, methods, annotations, and more
- **Annotation highlighting** — `@RestController`, `@PostMapping`, etc. in signature yellow (`#BBB529`)
- **Keyword styling** — `public`, `private`, `return`, `class` in warm orange (`#CC7832`)
- **String literals** — Green (`#6A8759`) just like IntelliJ
- **Method declarations** — Blue (`#56A8F5`) to distinguish definitions from calls
- **Full workbench theming** — Activity bar, sidebar, tabs, terminal, and more
- **Multi-language support** — Also includes styles for JSON, YAML, XML, Markdown, and Properties files

## Color Palette

| Element               | Color                                                        |
| --------------------- | ------------------------------------------------------------ |
| Background            | `#2B2B2B` |
| Foreground / Text     | `#A9B7C6` |
| Keywords              | `#CC7832` |
| Strings               | `#6A8759` |
| Annotations           | `#BBB529` |
| Numbers               | `#6897BB` |
| Method declarations   | `#56A8F5` |
| Constants             | `#9876AA` |
| Comments              | `#808080` |
| Javadoc               | `#629755` |

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
  }
}
```

## Screenshots

*Coming soon*

## License

[MIT](LICENSE)
