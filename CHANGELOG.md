# Changelog

## 0.1.0-alpha.7 (2025-08-14)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/e-invoice-be/e-invoice-java/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** api update ([311e44f](https://github.com/e-invoice-be/e-invoice-java/commit/311e44f37543ce127f08022886770c960ee05ba3))


### Performance Improvements

* **internal:** make formatting faster ([5b69fbc](https://github.com/e-invoice-be/e-invoice-java/commit/5b69fbc89f42c3762360fc9355455ca2dbee934b))


### Chores

* **example:** fix run example comment ([fe1f984](https://github.com/e-invoice-be/e-invoice-java/commit/fe1f98492c0678f764453fdddffbaa5eb0eaccea))
* increase max gradle JVM heap to 8GB ([e9440a3](https://github.com/e-invoice-be/e-invoice-java/commit/e9440a3ac9a5b4213e2c8d2a9c6d659e16c2070f))
* **internal:** codegen related update ([227345e](https://github.com/e-invoice-be/e-invoice-java/commit/227345efdb09466b0dc0e92c3bdd1eba8062ebd3))
* **internal:** codegen related update ([650bbc8](https://github.com/e-invoice-be/e-invoice-java/commit/650bbc8bfe961ad48a9f4c089110f5dc9a60e8f1))
* **internal:** dynamically determine included projects ([8e33968](https://github.com/e-invoice-be/e-invoice-java/commit/8e33968efe05120786ca51ecbd4acc7e9ca34fb5))
* **internal:** support passing arguments to test script ([b22cdda](https://github.com/e-invoice-be/e-invoice-java/commit/b22cddacbf4c7bf95f4ce4f499a8b655d6c7c4fe))
* **internal:** update comment in script ([9bcb766](https://github.com/e-invoice-be/e-invoice-java/commit/9bcb76606ac9c17b9e69324d6e6ed538319c930d))
* update @stainless-api/prism-cli to v5.15.0 ([b7840c3](https://github.com/e-invoice-be/e-invoice-java/commit/b7840c3f3e2be8c8a91827f0cb625a1a77aa9346))

## 0.1.0-alpha.6 (2025-08-05)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/e-invoice-be/e-invoice-java/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* add retryable exception ([3ba2ee0](https://github.com/e-invoice-be/e-invoice-java/commit/3ba2ee098d60afa3eafbd46d2a463186ed74b872))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([8212887](https://github.com/e-invoice-be/e-invoice-java/commit/821288744869772153e5d1102c5021558a91c9bb))
* **client:** allow configuring env via system properties ([922e82b](https://github.com/e-invoice-be/e-invoice-java/commit/922e82b7faedec5157906d5bcb4109d66fae0ce6))
* **client:** ensure compat with proguard ([5365433](https://github.com/e-invoice-be/e-invoice-java/commit/5365433fe3a3489deb6e17d5be8e76ca04adab42))


### Bug Fixes

* **client:** r8 support ([8368c2b](https://github.com/e-invoice-be/e-invoice-java/commit/8368c2b420c260634748826ce234b9ac3694c92d))
* **client:** some bad `_additionalBodyProperties` serialization ([9fcb985](https://github.com/e-invoice-be/e-invoice-java/commit/9fcb9854cf3064e604767465dfa981be3e93da50))


### Chores

* **internal:** add async lock helper ([df26ed2](https://github.com/e-invoice-be/e-invoice-java/commit/df26ed29f9e2bf7306a2732b293baff57cdb4a87))
* **internal:** bump ci test timeout ([f38c48d](https://github.com/e-invoice-be/e-invoice-java/commit/f38c48df97cbd9c8ccdff60e19ce6c5f5c317acd))
* **internal:** reduce proguard ci logging ([76ac77f](https://github.com/e-invoice-be/e-invoice-java/commit/76ac77fcd54b3196327b41c130ee1477550f818f))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([a926ca0](https://github.com/e-invoice-be/e-invoice-java/commit/a926ca08e02b2fb36c84d3cf22be0b3eb200fe85))
* **internal:** unskip some tests ([3b68970](https://github.com/e-invoice-be/e-invoice-java/commit/3b689707d5e3a4fafa31cb98dcdac3db52fab700))


### Documentation

* fix missing readme comment ([a006913](https://github.com/e-invoice-be/e-invoice-java/commit/a00691393b266b06beac8f9d23127ef847b28cba))
* more code comments ([a6d3c71](https://github.com/e-invoice-be/e-invoice-java/commit/a6d3c71d7fd8168a0c6324c0619d301935814480))

## 0.1.0-alpha.5 (2025-07-19)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/e-invoice-be/e-invoice-java/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** manual updates ([b88e6f3](https://github.com/e-invoice-be/e-invoice-java/commit/b88e6f3486cbca8c1408e727777a6b51bc8c4955))
* **client:** add https config options ([bd9f5df](https://github.com/e-invoice-be/e-invoice-java/commit/bd9f5df13c169317b272e82234f0aa97f09fde24))
* **client:** allow setting additional multipart body props ([85fec7d](https://github.com/e-invoice-be/e-invoice-java/commit/85fec7d33c4186959aa28dffab99f0b0358eb83a))


### Bug Fixes

* **client:** ensure error handling always occurs ([3f5b304](https://github.com/e-invoice-be/e-invoice-java/commit/3f5b304f92a5dd871ab33e37523d24044b0f6061))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([938a589](https://github.com/e-invoice-be/e-invoice-java/commit/938a58941beb598bb4e5ed2ed64b9f727e20ff7c))
* **internal:** allow running specific example from cli ([b7b4d4b](https://github.com/e-invoice-be/e-invoice-java/commit/b7b4d4bf4f4d59e42beed25d36c256852b976fbf))
* **internal:** refactor delegating from client to options ([0c79f11](https://github.com/e-invoice-be/e-invoice-java/commit/0c79f11d20b552df1ed4c183f814875841fda4a3))

## 0.1.0-alpha.4 (2025-07-01)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/e-invoice-be/e-invoice-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** api update ([c6c1d7f](https://github.com/e-invoice-be/e-invoice-java/commit/c6c1d7fdcd4ffd12cedf0b5eacb289d53e1563a3))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([36c9814](https://github.com/e-invoice-be/e-invoice-java/commit/36c98149d5d832801a5db19d138ebefa57baa499))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([014f090](https://github.com/e-invoice-be/e-invoice-java/commit/014f090e68f1476807d60540c2b8df63a1892a52))
* **client:** don't close client on `withOptions` usage when original is gc'd ([8653f47](https://github.com/e-invoice-be/e-invoice-java/commit/8653f4736152e078a10154de9fc34e935b9d5de7))


### Chores

* **ci:** only run for pushes and fork pull requests ([f3e7faa](https://github.com/e-invoice-be/e-invoice-java/commit/f3e7faa150ae18e912d05b1292139e9f1fda54c4))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([a9bc03b](https://github.com/e-invoice-be/e-invoice-java/commit/a9bc03b270c7120a91eb45b0a6293f73cd3d45a1))

## 0.1.0-alpha.3 (2025-06-17)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/e-invoice-be/e-invoice-java/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Chores

* **ci:** enable for pull requests ([c49c94c](https://github.com/e-invoice-be/e-invoice-java/commit/c49c94c06c606e91aed99bf3ddb5d696c0c3a1e9))

## 0.1.0-alpha.2 (2025-06-13)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/e-invoice-be/e-invoice-java/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** api update ([315c958](https://github.com/e-invoice-be/e-invoice-java/commit/315c9588a2b527ade8df91c9d143ae16168e4c6a))
* **api:** manual updates ([0c05809](https://github.com/e-invoice-be/e-invoice-java/commit/0c0580984c881990dc8093a9e3e64cdf89b2e05c))
* **api:** manual updates ([97bf1a6](https://github.com/e-invoice-be/e-invoice-java/commit/97bf1a6778519ef3d24dc8b8c5a73dbf994c31ee))
* **client:** add a `withOptions` method ([46b8e36](https://github.com/e-invoice-be/e-invoice-java/commit/46b8e36c4613c4cae250249ded9989667d6d4904))
* **client:** implement per-endpoint base URL support ([6aad447](https://github.com/e-invoice-be/e-invoice-java/commit/6aad447f90c5079e3fd844e3724f02ed1b7acc17))

## 0.1.0-alpha.1 (2025-06-01)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/e-invoice-be/e-invoice-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** manual updates ([561607f](https://github.com/e-invoice-be/e-invoice-java/commit/561607f8be66ac53bd5a3b588bf02e6bef2aa5d5))
* **api:** manual updates ([e314d61](https://github.com/e-invoice-be/e-invoice-java/commit/e314d61c20b9b7f863ccb443da644de7fde82167))


### Chores

* configure new SDK language ([54f96f1](https://github.com/e-invoice-be/e-invoice-java/commit/54f96f15abd40c4b8d8275639cf9aaa1bd64f4db))
* update SDK settings ([8880340](https://github.com/e-invoice-be/e-invoice-java/commit/88803400f70e764eac64aeccf32e1e750da9a969))
