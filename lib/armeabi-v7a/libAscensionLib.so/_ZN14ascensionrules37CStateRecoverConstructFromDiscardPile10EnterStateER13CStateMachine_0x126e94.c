// 函数: _ZN14ascensionrules37CStateRecoverConstructFromDiscardPile10EnterStateER13CStateMachine
// 地址: 0x126e94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r1_1 = *(arg1 + 0x24c)
void* r0 = *(r1_1 + 0x40)
int32_t* i = *(r0 + 0xc)

if (i != *(r0 + 0x10))
    int32_t r1
    int32_t var_28_1 = r1
    ascension::CPlayer* r6_1 = *(r1_1 + 4)
    
    do
        void* r4_1 = *i
        
        if (r4_1 != 0)
            void* r0_2 = *(r4_1 + 0xc)
            int32_t r2_1 = *(r0_2 + 0x88)
            
            if (r2_1 == 2)
            label_126f24:
                int32_t r0_5
                
                if (*(arg1 + 0x254) != 0)
                    r0_5 = ascension::CWorld::QueryCardFaction(r6_1, *(arg1 + 0x24c), r4_1)
                
                if (*(arg1 + 0x254) == 0 || r0_5 != 0)
                    int32_t (* const var_30_1)(CStateMachine&, CState*, int32_t, uint32_t*)
                    uint16_t r0_7
                    char* r2_3
                    void (* r3_2)(CStateMachine&, CState*, int32_t, uint32_t*)
                    
                    if (zx.d(*(arg1 + 0x250)) == 0)
                        var_30_1 =
                            ascensionrules::CStateRecoverConstructFromDiscardPile::SelectConstruct
                        r0_7 = arg1.w
                        void* var_2c_2 = r4_1
                        r2_3 = 0xa030
                        r3_2 = "Put %s in hand"
                    else
                        var_30_1 =
                            ascensionrules::CStateRecoverConstructFromDiscardPile::SelectConstruct
                        void* var_2c_1 = r4_1
                        r3_2 = "Put %s on deck"
                        r2_3 = 0xa031
                        r0_7 = arg1.w
                    
                    CGameStateOptions::AddSimpleUserOption(r0_7, *(r4_1 + 8), r2_3, r3_2, var_30_1)
            else if (r2_1 == 1 && zx.d(*(r1_1 + 0xa4)) != 0
                    && ascension::CCard::IsCardFaction(r0_2) != 0)
                goto label_126f24
        
        r1_1 = *(arg1 + 0x24c)
        i = &i[1]
    while (i != *(*(r1_1 + 0x40) + 0x10))

int32_t var_2c_3 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
*(arg1 + 0x24c)
*(arg1 + 0x250)
jump(*(*arg1 + 0x34))
