# Java Course 2013 Team A

## Summary

このリポジトリでは、Javaコース参加者のリポジトリをsubmoduleとして束ねています。

初回は以下のコマンドを実行してください。

```sh
$ git clone https://github.com/JavaCourse2013/A.git --recursive
```

サブモジュールを更新する場合は以下のコマンドを実行してください。

```sh
$ ./gradlew update
```

解答状況は[list.html](http://htmlpreview.github.io/?https://github.com/JavaCourse2013/A/blob/master/list.html)にまとめられています。
`list.html`は以下のコマンドで更新することができます。

```sh
$ ./gradlew list
```

`list.html`に解答状況を反映させるにはmasterブランチに
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

この構造に従わない場合は、
インタフェース[Resolver](buildSrc/src/main/groovy/Resolver.groovy)を`YournameResolver`として実装してください。
[DefaultResolver](buildSrc/src/main/groovy/DefaultResolver.groovy)が参考になります。
実装は`buildSrc/src/main/custom-resolver/YournameResolver.groovy`として配置してください。

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
