#just run this file
# sh git.sh
# git.sh is the filename
cd /Users/arjun/git/src
git checkout master
git pull
git add .
echo 'Arjun! Enter the commit message:'
read commitMessage
git commit -m "$commitMessage"
git push origin master

