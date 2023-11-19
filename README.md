# 目的
high & lowの開発を通して乱数の使い方とループ処理を学習する。

## Scannerクラスについて

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 入力処理を行う
        scanner.close();
    }
}
```
### Scannerクラスの役割
キーボードから入力された文字列や数値を受け取ってプログラムの中で処理することができる。
ex) 19行目の(h/l)で選択を求める

## コードの解説

```
import java.util.Scanner;
```
Javaプログラミング言語でScannerクラスを使うための宣言

```
 public static void main(String[] args) {
 ```

 - public : どのメソッドでもアクセス可能
 - static : mainメソッドはクラスのインスタンス化なしで呼び出せる
 - void : mainメソッドの戻り値がなし
 - main : Javaプログラムのエントリーポイント(1番初めに呼ばれるメソッド)
 - String[] args : ユーザーからの入力を受け取り、処理を行ったり、特定の処理を実行したりするためのコードを書くことができる、クラス名の後に続ける引数(コマンドライン引数)

```
System.out.println("************");
System.out.println("*High & Low*");
System.out.println("************");
System.out.println("");
```
問題のトップページ、繰り返し処理をしない部分を記述

```
 Scanner sc = new Scanner(System.in);
```

Scannerクラス(sc)をSystem.inに関連付けることで、scを通してユーザーからのキーボード入力を読み取ることができる

- System.in : キーボードの入力を表す
- new Scanner(System.in) :  Scannerクラスの新しいインスタンスを作成

```
while (true) {
int leftCard = (int) (Math.random() * 9) + 1;
int rightCard = (int) (Math.random() * 9) + 1;
```

- while : 無限ループ、ゲームが終了(プレイヤーが負けるまで)行う
- int leftCard = (int) (Math.random() * 9) + 1; : leftCardというインスタンスを設定し、(Math.random()で0以上9未満の乱数を生成する、intで整数型に変更

```
String select = sc.nextLine();
```
nextLine()メソッドは、ユーザーが入力したテキスト（改行文字まで）を読み取る。具体的には、ユーザーがキーボードからEnterキーを押すまでのテキストを取得する。


```
if (select.equals(result)) {
```
select変数に格納された文字列とresult変数に格納された文字列が等しいかどうかを比較する