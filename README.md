# ConfigManager - Gerenciador de Configurações

O ConfigManager é uma pequena biblioteca Java para gerenciar configurações a partir de um arquivo de propriedades.

## Descrição

O ConfigManager permite carregar configurações de um arquivo de propriedades chamado `config.properties` e disponibilizá-las para uso em seu aplicativo Java. Ele fornece uma maneira simples de acessar essas configurações em todo o seu código.

## Recursos

- Carregar configurações do arquivo `config.properties`.
- Acesso fácil às configurações em seu código.

## Como Usar

1. Clone este repositório em seu projeto Java.
2. Certifique-se de que o arquivo `config.properties` está no mesmo diretório onde seu programa será executado.
3. Inicialize o `ConfigManager` em seu código para acessar as configurações.

Exemplo de uso:

```java
// Inicialize o ConfigManager
ConfigManager configManager = ConfigManager.getInstance();

// Acesse as configurações
String dbUrl = configManager.getConfig().getProperty("db.url");
String dbUser = configManager.getConfig().getProperty("db.user");
String dbPassword = configManager.getConfig().getProperty("db.password");
