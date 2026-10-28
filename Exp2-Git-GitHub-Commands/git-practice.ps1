Write-Host "Git practice command sequence (review and run one command at a time):"
$commands = @(
  "git init",
  "git status",
  "git add .",
  'git commit -m "First commit"',
  "git branch feature-demo",
  "git switch feature-demo",
  'git commit -am "Update practice file"',
  "git switch main",
  "git merge feature-demo",
  "git log --oneline --graph --all"
)
$commands | ForEach-Object { Write-Host "  $_" }
