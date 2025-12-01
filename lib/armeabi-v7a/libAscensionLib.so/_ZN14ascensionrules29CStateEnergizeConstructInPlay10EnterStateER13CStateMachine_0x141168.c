// 函数: _ZN14ascensionrules29CStateEnergizeConstructInPlay10EnterStateER13CStateMachine
// 地址: 0x141168
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x24c)
int32_t* i = *(r2 + 0x54)

if (i != *(r2 + 0x58))
    ascension::CConstructInstance* r10_1 = *(r2 + 4)
    int32_t r6_1 = *(r10_1 + 0xb4c)
    
    do
        void* r4_1 = *i
        int32_t r0_3 = *(*(*(r4_1 + 0x10) + 0xc) + 0xac)
        
        if (r0_3 != 0 && r0_3 s> r6_1 && ascension::CWorld::IsConstructEnergized(r10_1) == 0)
            void* var_2c_1 = r4_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r4_1 + 8), 0xa070, "Energize %s", 
                ascensionrules::CStateEnergizeConstructInPlay::SelectConstructToEnergize)
        
        i = &i[1]
    while (i != *(*(arg1 + 0x24c) + 0x58))

jump(*(*arg1 + 0x34))
