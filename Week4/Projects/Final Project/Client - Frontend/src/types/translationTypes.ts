export type Testing = {
    headerTitle: {
        title: string;
    };
    mainSection:{
        title: string;
        tableHeaders: {
            name: string;
            email: string;
            phone: string;
            stateCity: string;
            githubUrl: string;
            career: string;
            role: string;
            skills: string;
            englishLevel: string;
            otherLangs: string;
            delete: string;
        };
    }
    navbarLinks: {
        link1: string;
        link2: string;
    };
    footerSection: {
        copyRightSectionTitle: string;
    };
    joinUsForm: {
        title: string;
        description: string;
        questions: {
            email: string;
            name: string;
            phone: string;
            stateCity: string;
            githubUrl: string;
            career: string;
            role: string;
            roleOther: string;
            skills: string;
            englishLevel: string;
            otherLangs: string;
        };
        options: {
            yes: string;
            no: string;
            englishLevel: {
                0: string;
                1: string;
                2: string;
                3: string;
                4: string;
                5: string;
            };
            roles: {
                1: string;
                2: string;
                3: string;
                4: string;
            };
        };
        privacyPoints: {
            privacyPolicy: string;
        };
        buttonSubmit: {
            text: string;
        }
    };
};
