import type { Testing } from "@/types/translationTypes";

const translations: { en: Testing; es: Testing } = {
    en: {
        headerTitle:{
            title: "Java Academy - Final Project",
        },
        navbarLinks: {
            link1: "Home",
            link2: "Form",
        },
        footerSection: {
            copyRightSectionTitle: "All Rights Reserved.",
        },
        joinUsForm: {
            title: "Java Academy January - February 2023",
            description:
                "Hello! Through this questionnaire you would be able to fill the database of the Java Academy January - February 2023 and see the people involved.",
            questions: {
                email: "Email:",
                name: "Full name:",
                phone: "Contact phone:",
                stateCity: "State and city:",
                githubUrl: "Url to GitHub profile:",
                career: "Career or formation:",
                role: "Role or Position:",
                roleOther: "Which?",
                skills: "Skills (They can be technical, like programming languages, or soft skills, like responsability or communication)",
                englishLevel: "English level:",
                otherLangs: "Other languages:",
            },
            options: {
                yes: "Yes",
                no: "No",
                englishLevel: {
                    0: "The person does not know English.",
                    1: "The person knows very little English.",
                    2: "The person is capable of understanding English, but they have difficulty communicating in it.",
                    3: "The person is capable of communicating in English, but they have trouble understanding it.",
                    4: "The person is capable of both communicating and understanding English, but they lack practice.",
                    5: "The person has no difficulties with English."
                },
                roles: {
                    1: "Student",
                    2: "Instructor",
                    3: "Human Resources",
                    4: "Other"
                }
            },
            privacyPoints: {
                privacyPolicy:
                    "I have read and agree with data <a href='/talent-network-privacy-policy'>privacy policy</a> for this data base."
            },
            buttonSubmit:{
                text: "Send"
            }
        },
    },
    es: {
        headerTitle:{
            title: "Academia Java - Proyecto Final",
        },
        navbarLinks: {
            link1: "Inicio",
            link2: "Formulario",
        },
        footerSection: {
            copyRightSectionTitle: "Todos los derechos reservados.",
        },
        joinUsForm: {
            title: "Academia Java Enero - Febrero 2023",
            description:
                "¡Hola! A través de este cuestionario podrás llenar la base de datos de la Academia Java Enero - Febrero 2023 y ver las personas que participaron.",
            questions: {
                email: "Correo:",
                name: "Nombre completo:",
                phone: "Número de contacto:",
                stateCity: "Estado y municipio:",
                githubUrl: "Liga a perfil de GitHub:",
                career: "Carrera o formación:",
                role: "Rol / Puesto:",
                roleOther: "¿Cuál?",
                skills: "Habilidades (Pueden ser técnicas como lenguajes de programación o habilidades blandas como responsabilidad o comunicación)",
                englishLevel: "Nivel de inglés:",
                otherLangs: "Otros idiomas:",
            },
            options: {
                yes: "Sí",
                no: "No",
                englishLevel: {
                    0: "La persona no sabe inglés.",
                    1: "La persona sabe muy poco inglés.",
                    2: "La persona es capaz de entender inglés, pero tiene dificultades para comunicarse en él.",
                    3: "La persona es capaz de comunicarse en inglés, pero tiene problemas para entenderlo.",
                    4: "La persona es capaz tanto de comunicarse como de entender inglés, pero le falta práctica.",
                    5: "La persona no tiene problemas con el inglés."
                },
                roles: {
                    1: "Estudiante",
                    2: "Instructor",
                    3: "Recursos Humanos",
                    4: "Otro"
                }
            },
            privacyPoints: {
                privacyPolicy:
                    "He leído y estoy de acuerdo con la <a href='/privacy-policy'>política de privacidad</a> de esta base de datos."
            },
            buttonSubmit:{
                text: "Enviar"
            }
        }
    }
};

export default translations;
