/* Felipe Sanches Venâncio - 251670 */

// =========================
// ELEMENTOS DO FORMULÁRIO
// =========================

const formulario = document.getElementById("form-inscricao");

const campoNome = document.getElementById("nome");
const campoEmail = document.getElementById("email");
const campoTelefone = document.getElementById("telefone");

const campoDataInicio = document.getElementById("dataInicio");
const campoDataFim = document.getElementById("dataFim");

const campoTema = document.getElementById("tema");
const campoObs = document.getElementById("obs");

const campoTermos = document.getElementById("termos");

const campoBotaoEnviar = document.getElementById("btn-enviar");
const campoBotaoLimpar = document.getElementById("btn-limpar");

const mensagemGeral = document.getElementById("msg-global");

// =========================
// EXPRESSÕES REGULARES
// =========================

const regexEmail = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

const regexTelefone = /^\(?\d{2}\)?\s?\d{4,5}-?\d{4}$/;

// =========================
// FUNÇÕES DE ERRO
// =========================

function mostrarErro(campo, idElementoErro, mensagem) {

    const elementoErro =
    document.getElementById(idElementoErro);

    campo.classList.add("is-invalid");

    elementoErro.textContent = mensagem;
}

function limparErro(campo, idElementoErro) {

    const elementoErro =
    document.getElementById(idElementoErro);

    campo.classList.remove("is-invalid");

    elementoErro.textContent = "";
}

// =========================
// MENSAGEM GLOBAL
// =========================

function esconderMensagemGeral() {

    mensagemGeral.classList.add("d-none");

    mensagemGeral.classList.remove("alert-success");
    mensagemGeral.classList.remove("alert-danger");

    mensagemGeral.textContent = "";
}

function mostrarMensagemSucesso() {

    mensagemGeral.classList.remove("d-none");

    mensagemGeral.classList.add("alert");
    mensagemGeral.classList.add("alert-success");

    mensagemGeral.textContent =
    "Inscrição enviada com sucesso!";
}

// =========================
// VALIDAÇÃO DO FORMULÁRIO
// =========================

function validarFormulario() {

    let formularioValido = true;

    esconderMensagemGeral();

    // =========================
    // NOME
    // =========================

    if (campoNome.value.trim() === "") {

        mostrarErro(
            campoNome,
            "err-nome",
            "Informe o nome completo."
        );

        formularioValido = false;

    } else {

        limparErro(campoNome, "err-nome");
    }

    // =========================
    // EMAIL
    // =========================

    if (!regexEmail.test(campoEmail.value)) {

        mostrarErro(
            campoEmail,
            "err-email",
            "Informe um e-mail válido."
        );

        formularioValido = false;

    } else {

        limparErro(campoEmail, "err-email");
    }

    // =========================
    // TELEFONE
    // =========================

    if (!regexTelefone.test(campoTelefone.value)) {

        mostrarErro(
            campoTelefone,
            "err-telefone",
            "Informe um telefone válido."
        );

        formularioValido = false;

    } else {

        limparErro(campoTelefone, "err-telefone");
    }

    // =========================
    // DATA INÍCIO
    // =========================

    if (campoDataInicio.value.trim() === "") {

        mostrarErro(
            campoDataInicio,
            "err-dataInicio",
            "Informe a data de início."
        );

        formularioValido = false;

    } else {

        limparErro(campoDataInicio, "err-dataInicio");
    }

    // =========================
    // DATA FIM
    // =========================

    if (campoDataFim.value.trim() === "") {

        mostrarErro(
            campoDataFim,
            "err-dataFim",
            "Informe a data final."
        );

        formularioValido = false;

    } else {

        limparErro(campoDataFim, "err-dataFim");
    }

    // =========================
    // TEMA
    // =========================

    if (campoTema.value === "") {

        mostrarErro(
            campoTema,
            "err-tema",
            "Selecione um tema."
        );

        formularioValido = false;

    } else {

        limparErro(campoTema, "err-tema");
    }

    // =========================
    // OBSERVAÇÃO
    // =========================

    if (campoObs.value.trim() === "") {

        mostrarErro(
            campoObs,
            "err-obs",
            "Informe uma observação."
        );

        formularioValido = false;

    } else {

        limparErro(campoObs, "err-obs");
    }

    // =========================
    // TERMOS
    // =========================

    if (!campoTermos.checked) {

        mostrarErro(
            campoTermos,
            "err-termos",
            "Aceite os termos."
        );

        formularioValido = false;

    } else {

        limparErro(campoTermos, "err-termos");
    }

    // =========================
    // RETORNO FINAL
    // =========================

    return formularioValido;
}

// =========================
// EVENTO DE SUBMIT
// =========================

formulario.addEventListener(
    "submit",
    function(event) {

        event.preventDefault();

        const formularioValido =
        validarFormulario();

        if (formularioValido) {

            mostrarMensagemSucesso();
        }
    }
);

// =========================
// BOTÃO LIMPAR
// =========================

campoBotaoLimpar.addEventListener(
    "click",
    function() {

        formulario.reset();

        limparErro(campoNome, "err-nome");
        limparErro(campoEmail, "err-email");
        limparErro(campoTelefone, "err-telefone");

        limparErro(campoDataInicio, "err-dataInicio");
        limparErro(campoDataFim, "err-dataFim");

        limparErro(campoTema, "err-tema");
        limparErro(campoObs, "err-obs");
        limparErro(campoTermos, "err-termos");

        esconderMensagemGeral();
    }
);

