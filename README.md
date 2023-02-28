```bash
#1.Create two directory
mkdir preschooler schoolkid
#2.Create txt files
cd schoolkid/
touch robots.txt constructor.txt board_games.txt
#3.
touch cars.txt soft_toys.txt dolls.txt
touch cars.txt soft_toys.txt dolls.txt
#4.union preschooler and schoolkid
cd ../preschooler/
mkdir toy_name && cp preschooler/* toy_name && cp schoolkid/* toy_name
#5. Rename directory
mv toy_name toys
#6.
ls toys/
board_games.txt  constructor.txt  robots.txt
cars.txt         dolls.txt        soft_toys.txt
#7. Install snap-package.
snap find sublime-text
snap install sublime-text
#8 add in crontab new task
crontab -e
#add new task
*/3 * * * * cp ~/test.txt ~/test.bak
#save and exit
```
