# Instructions to Push to GitHub

## Step 1: Create a New Repository on GitHub

1. Go to [GitHub](https://github.com)
2. Click the **+** icon in the top right corner
3. Select **New repository**
4. Enter a repository name (e.g., `employee-management-system`)
5. Add a description (optional): "A console-based Employee Management System with MVC architecture"
6. Choose **Public** or **Private**
7. **DO NOT** initialize with README, .gitignore, or license (we already have these)
8. Click **Create repository**

## Step 2: Connect Your Local Repository to GitHub

After creating the repository on GitHub, run these commands in your terminal:

```bash
# Set your Git username and email (if not already set)
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

# Add the remote repository (replace YOUR_USERNAME with your GitHub username)
git remote add origin https://github.com/YOUR_USERNAME/employee-management-system.git

# Verify the remote was added
git remote -v

# Push your code to GitHub
git push -u origin master
```

## Step 3: Verify Your Upload

1. Go to your GitHub repository URL
2. You should see all your files
3. The README.md will be displayed on the main page

## Alternative: Using SSH (Recommended for frequent users)

If you have SSH keys set up:

```bash
# Add remote using SSH
git remote add origin git@github.com:YOUR_USERNAME/employee-management-system.git

# Push to GitHub
git push -u origin master
```

## Future Updates

After the initial push, to update your repository:

```bash
# Stage changes
git add .

# Commit changes
git commit -m "Your commit message describing the changes"

# Push to GitHub
git push
```

## Common Issues and Solutions

### Issue: "Remote origin already exists"
```bash
# Remove existing remote
git remote remove origin

# Add the correct remote
git remote add origin https://github.com/YOUR_USERNAME/employee-management-system.git
```

### Issue: Authentication Required
- You may need to use a Personal Access Token (PAT) instead of your password
- Create a PAT at: GitHub Settings → Developer settings → Personal access tokens
- Use the token as your password when pushing

### Issue: Branch name "master" vs "main"
If GitHub uses "main" as default:
```bash
# Rename your branch
git branch -M main

# Push to main
git push -u origin main
```

## Next Steps

After pushing to GitHub:
1. Add a LICENSE file (if desired)
2. Create GitHub Actions for CI/CD (optional)
3. Add badges to your README (build status, etc.)
4. Configure branch protection rules
5. Invite collaborators if needed

---

**Your project is now ready to be pushed to GitHub!**

