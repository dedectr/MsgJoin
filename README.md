<div align="center">

# 🎮 MsgJoin

**Plugin de mensagens personalizadas de entrada e saída para servidores Paper**

[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Paper](https://img.shields.io/badge/Paper-1.21.11-blue?logo=minecraft&logoColor=white)](https://papermc.io/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)

</div>

---

## ✨ Sobre

O **MsgJoin** permite trocar as mensagens padrão de **entrada** (`PlayerJoinEvent`) e **saída** (`PlayerQuitEvent`) do servidor por textos totalmente personalizados, definidos em um arquivo de configuração simples.

Em vez do clássico `Player joined the game`, o servidor exibe a mensagem que você quiser — com o nome do jogador adicionado automaticamente ao final.

## 🚀 Funcionalidades

- ✅ Mensagem de entrada personalizada
- ✅ Mensagem de saída personalizada
- ✅ Configuração via `messagens.yml`, sem precisar recompilar
- ✅ Compatível com Paper 1.21.11 e Java 21

## ⚙️ Configuração

O arquivo fica em `plugins/JoinTheLeaveServer/messagens.yml` e possui duas chaves:

| Chave    | Descrição                          | Padrão       |
| -------- | ---------------------------------- | ------------ |
| `entrou` | Prefixo da mensagem de entrada     | `"[+] »» "`  |
| `saiu`   | Prefixo da mensagem de saída       | `"[-] »» "`  |

Exemplo:

```yaml
entrou: "§a[+] §7»» §f"
saiu: "§c[-] §7»» §f"
```

> O nome do jogador é concatenado automaticamente ao final do valor definido.
> Códigos de cor com `§` (`§a`, `§c`, `§l`, ...) são suportados nas mensagens.

## 📦 Instalação

1. Baixe ou compile o `JoinTheLeaveServer-1.0.1.jar` (veja abaixo).
2. Coloque o arquivo na pasta `plugins/` do seu servidor Paper.
3. Inicie o servidor uma vez para gerar a pasta do plugin.
4. Edite `plugins/JoinTheLeaveServer/messagens.yml` com as suas mensagens (crie o arquivo caso ele não exista).
5. Reinicie o servidor (ou recarregue o plugin).

## 🔨 Compilando

**Requisitos:** Java 21+ e Maven.

```bash
git clone https://github.com/dedectr/MsgJoin.git
cd MsgJoin
mvn clean package
```

O `defaultGoal` do projeto já executa `clean package`, então `mvn` sozinho também funciona. O JAR final é gerado em:

```
target/JoinTheLeaveServer-1.0.1.jar
```

## 🗂️ Estrutura do projeto

```
MsgJoin/
├── pom.xml
└── src/main/
    ├── java/xyz/al3ncar/joinTheLeaveServer/
    │   ├── JoinTheLeaveServer.java      # Classe principal do plugin
    │   ├── events/
    │   │   ├── onJoin.java              # Mensagem de entrada
    │   │   └── onLeave.java             # Mensagem de saída
    │   └── utils/
    │       └── MsgYml.java              # Leitura do messagens.yml
    └── resources/
        ├── plugin.yml
        └── messagens.yml
```

## 🧩 Compatibilidade

| Requisito    | Versão        |
| ------------ | ------------- |
| Servidor     | Paper 1.21.11 |
| Java         | 21+           |
| Build        | Maven         |

## 📄 Licença

Este projeto não possui uma licença definida. Todos os direitos reservados ao autor.
