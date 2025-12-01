// 函数: _ZN14ascensionrules30CStatePutCardIntoPlayerDiscard10EnterStateER13CStateMachine
// 地址: 0x146438
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r1 = *(arg1 + 0x24c)
void* r0 = *(arg1 + 0x25c)
ascension::CPlayer* r6 = *(r1 + 4)

if (r0 != 0 && *(r0 + 4) == 0x1b)
    uint32_t result = zx.d(*(r0 + 0x65))
    
    if (result != 0)
        return result

int32_t r0_2 = *(r6 + 0x1c) - *(r6 + 0x18)

if (r0_2 s>= 1)
    int32_t r7_1 = 0
    
    while (true)
        void* r0_4 = ascension::CWorld::GetPlayerByTurnOrder(r6, r1)
        
        if (zx.d(*(arg1 + 0x258)) != 0 || r0_4 != *(arg1 + 0x24c))
            void* var_2c_1 = r0_4
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa058, "Give to %s", 
                ascensionrules::CStatePutCardIntoPlayerDiscard::SelectPlayer)
        
        r7_1 += 1
        
        if (r7_1 s>= r0_2 s>> 2)
            break
        
        r1 = *(arg1 + 0x24c)

if (*(arg1 + 0x254) != 0)
    int32_t var_2c_2 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)

*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
