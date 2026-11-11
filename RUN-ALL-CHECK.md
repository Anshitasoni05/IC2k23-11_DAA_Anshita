# Compile check

Each folder is an independent Java exercise and reuses the class name `Main`. Compile one source file at a time into a clean output directory:

```bash
mkdir -p out
javac -d out Unit1-Arrays/Program01-ArrayOperations/Main.java
java -cp out Main
```

On Windows PowerShell, use `New-Item -ItemType Directory -Force out` instead of `mkdir -p`.
