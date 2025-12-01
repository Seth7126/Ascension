// 函数: _ZN14ascensionrules30CStatePutConstructOnCenterDeck10EnterStateER13CStateMachine
// 地址: 0x140c04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r4 = *(arg1 + 0x24c)
int32_t* i = *(r4 + 0x54)

if (i != *(r4 + 0x58))
    ascension::CPlayer* r6_1 = *(r4 + 4)
    
    do
        void* r8_1 = *i
        
        if (ascension::CWorld::QueryCardFaction(r6_1, r4, *(r8_1 + 0x10)) != 0)
            void* var_2c_1 = r8_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_1 + 8), 0xa036, "Return %s", 
                ascensionrules::CStatePutConstructOnCenterDeck::SelectConstruct)
        
        r4 = *(arg1 + 0x24c)
        i = &i[1]
    while (i != *(r4 + 0x58))

jump(*(*arg1 + 0x34))
