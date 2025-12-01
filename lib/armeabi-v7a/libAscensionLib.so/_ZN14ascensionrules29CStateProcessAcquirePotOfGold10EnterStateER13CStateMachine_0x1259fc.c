// 函数: _ZN14ascensionrules29CStateProcessAcquirePotOfGold10EnterStateER13CStateMachine
// 地址: 0x1259fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r8 = *(*(arg1 + 0x24c) + 4)
int32_t r0_2 = ascension::CDatabase::GetCard(ascension::g_Database)
void* r4 = *(r8 + 0xa68)

if (r4 != 0 && *(r4 + 0x10) != 0)
    void* r0_4 = *(r4 + 0x14)
    
    if (r0_4 != 0 && r0_2 == *(r0_4 + 0xc))
        int32_t var_38_2 = 0
        ascension::CWorld::OutputEvent(r8, 0x2a, zx.d(*(*(arg1 + 0x24c) + 8)), 1)
        void* var_34_2 = r4
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r4 + 8), 0xa020, "Acquire %s", 
            ascensionrules::CStateProcessAcquirePotOfGold::SelectAcquireFromEndOfRainbow)

int32_t r0_6 = *(r8 + 0x1c) - *(r8 + 0x18)

if (r0_6 s> 4)
    int32_t r1
    int32_t var_30_1 = r1
    int32_t i = 1
    ascension::CPlayer* var_28_1 = r8
    
    do
        void* r0_9 = ascension::CWorld::GetPlayerByTurnOrder(r8, *(arg1 + 0x24c))
        int32_t* r10_1 = *(r0_9 + 0x54)
        int32_t r0_10 = *(r0_9 + 0x58)
        
        if (r10_1 != r0_10)
            do
                void* r2_2 = *r10_1
                
                if (r0_2 == *(*(r2_2 + 0x10) + 0xc))
                    void* var_34_1 = r2_2
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_2 + 8), 0xa057, "Take %s", 
                        ascensionrules::CStateProcessAcquirePotOfGold::SelectAcquireFromOpponent)
                    r0_10 = *(r0_9 + 0x58)
                
                r10_1 = &r10_1[1]
            while (r10_1 != r0_10)
        
        i += 1
        r8 = var_28_1
    while (i s< r0_6 s>> 2)

*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
