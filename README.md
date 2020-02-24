# vigenere

[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)

An implementation of Vigenère cipher in Java.

Supports encryption and decryption of texts written in a Latin alphabet.

## Background

This program is a solution to a programming assignment for the Information Security course at [ITMO University].

[ITMO University]: https://en.itmo.ru/en/

## Install

```
./gradlew clean installDist
```

This will generate executable files in directory `build/install/vigenere`.

## Usage

To use the program, first install it as described above, then `cd` to installation directory.

### Set encryption key

The software accepts encryption/decryption keys via the environment variable `VIGENERE_KEY`.
The key can be set with a shell command:
```
VIGENERE_KEY="<ENCRYPTION KEY>"
export VIGENERE_KEY
```
Replace `<ENCRYPTION KEY>` with your encryption key.

### Encrypt

Given the plaintext is in file `plain.txt`, issue the following command to encrypt it:

```
bin/vigenere encrypt < plain.txt > cipher.txt
```

This command will use the value of the `VIGENERE_KEY` environment variable as the encryption key.

### Decrypt

Given the file `cipher.txt` contains the ciphertext, run the command below to decrypt it to the file `plain.txt`:

```
bin/vigenere decrypt < cipher.txt > plain.txt
```

This command will use the decryption key from the environment variable `VIGENERE_KEY`. 

## Contributing

PRs accepted.

## Unlicense

Written by Egor Dubenetskiy, 2020.
For licensing information, see `UNLICENSE.txt`.
