# Java Cource 2013 Team A

## Summary

このリポジトリでは、Javaコース参加者のリポジトリをsubmoduleとして束ねています。

初回は以下のコマンドを実行してください。

```sh
$ git clone https://github.com/JavaCourse2013/A.git --recursive
```

更新する場合は以下のコマンドを実行してください。

```sh
$ git pull
$ git submodule foreach git fetch --all
$ git submodule foreach git reset --hard origin/master
```

解答状況は[list.md](list.md)にまとめられています。
list.mdは以下のコマンドで更新することができます。

```sh
./gradlew list
```

list.mdに解答状況を反映させるにはmasterブランチに
以下のディレクトリ構造で練習問題を配置してください。

```
<master branch root>/
JPL
	chXX
		exXX_XX		<- この中にソースコード
		...
	...
GUI
	1_1				<- この中にソースコードおよびJAR
	...
Interpret			<- この中に16章課題
```

## Questionnaire

質問表は[こちら](https://docs.google.com/spreadsheet/ccc?key=0Av7ifCZEYfJtdFpCdC1KZVdOTEJpdmtWVURGbjEzYnc)にあります。

## Members
 * [watagashi78 (Hasegawa)](https://github.com/watagashi78)
 * [shrhdk (shiro)](https://github.com/shrhdk)
 * [mikan (kato)](https://github.com/mikan)
 * [ichihira (sugimoto)](https://github.com/ichihira)
 * [zDpxq6 (hatanaka)](https://github.com/zDpxq6)
 * [akeboshi (aruga)](https://github.com/akeboshi)
 * [1-14j4z1-11 (hayashi)](https://github.com/1-14j4z1-11)
 * [YN111 (nakamura)](https://github.com/YN111)
 * [Nkitoh (kito)](https://github.com/Nkitoh)
 * [ko-haneda (haneda)](https://github.com/ko-haneda)
 * [RyohKamiya (kamiya)](https://github.com/RyohKamiya)
