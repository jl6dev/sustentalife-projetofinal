🌱 SustentaLife — App de Sustentabilidade


Sobre o Projeto

O SustentaLife é um aplicativo voltado para incentivar hábitos sustentáveis no dia a dia.
Ele foi desenvolvido com o objetivo de promover consciência ambiental por meio de dicas, desafios e acompanhamento de práticas sustentáveis, como economia de água, reciclagem, mobilidade ecológica e redução de resíduos.

O aplicativo busca tornar mudanças ambientais mais acessíveis, mostrando ao usuário seu progresso e impactando positivamente seu estilo de vida.

Equipe

Integrantes:
	•	Jamyle Monteiro
	•	Kaylane Silvano
	•	Tainara Melissa
	•	Pablo Gabriel

Todos os membros participaram do desenvolvimento do projeto, contribuindo com commits, organização do repositório e tomadas de decisão durante o processo.

Funcionalidades
•	Lista de desafios sustentáveis com opção de marcar concluído
•	Dicas ambientais exibidas ao usuário
•	Sistema de metas com acompanhamento visual
•	Consumo de API (ex: clima ou reciclagem) com Retrofit
•	Interface responsiva e acessível, com suporte para leitor de tela
•	Fluxos assíncronos usando Coroutines

Arquitetura e Tecnologias Utilizadas

Kotlin

Jetpack Compose

Arquitetura MVVM

Navigation Component

StateFlow / LiveData

SharedFlow / SingleLiveEvent

Coroutines + viewModelScope

Retrofit para consumo de API

Material Design + Acessibilidade

📁 Estrutura Geral do Projeto

app

data (API, models, repository)

ui (screens, components, theme)

viewmodel

navigation

Organizado seguindo boas práticas de arquitetura e separação de responsabilidades.

Como Executar o Projeto

Acesse o repositório no GitHub.

Faça o download ou clone via terminal:
git clone https://github.com/jl6dev/sustentalife-projetofinal

Abra o projeto no Android Studio (versão Flamingo ou superior).

Aguarde o Gradle sincronizar.

Execute em um dispositivo físico ou emulador (Android 8.0 ou superior).

 APK

O arquivo APK final do projeto está disponível na pasta release.
Também pode ser encontrado na aba Releases do repositório GitHub.

 Prints e Demonstração

(Adicionar futuramente)

Sugestões que podem aparecer:
• Tela inicial
• Tela de dicas
• Lista de desafios
• Tela de progresso
• GIF mostrando o uso

⸻

🔀 Organização no GitHub
• Cada nova funcionalidade foi desenvolvida em uma branch própria.
• Pull Requests foram revisados antes do merge.
• Commits possuem descrição clara do que foi alterado.
• O repositório segue uma estrutura limpa e padronizada.

Desafios e Aprendizados

Durante o desenvolvimento do projeto, enfrentamos desafios como:
• Organização da arquitetura MVVM
• Consumo de API com Retrofit
• Acessibilidade e responsividade no Compose
• Controle de estado com StateFlow
• Tratamento de eventos únicos sem recomposição desnecessária

Esses desafios contribuíram para o aprendizado e evolução técnica da equipe.

⸻

📚 Melhorias Futuras
• Notificações e lembretes diários
• Sistema de ranking e gamificação
• Integração com banco local (Room)
• Tela de login e sincronização em nuvem
• Tema claro/escuro

⸻

🧾 Licença

Projeto desenvolvido para fins educacionais — IFPE Campus Palmares.

⸻

🌿 Pequenas ações transformam o mundo. Um hábito sustentável de cada vez.

