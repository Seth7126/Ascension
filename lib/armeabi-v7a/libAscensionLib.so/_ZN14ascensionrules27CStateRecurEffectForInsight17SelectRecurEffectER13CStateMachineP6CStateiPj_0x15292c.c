// 函数: _ZN14ascensionrules27CStateRecurEffectForInsight17SelectRecurEffectER13CStateMachineP6CStateiPj
// 地址: 0x15292c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(arg2 + 0x24c)
void* r1 = *(arg2 + 0x254)
uint32_t r3 = 0
uint32_t r7 = *(r6 + 4)

if (r1 != 0)
    r3 = zx.d(*(r1 + 8))

int32_t var_30 = 0
ascension::CWorld::OutputEvent(r7, 0x3d, zx.d(*(r6 + 8)), r3)
int32_t r8 = *(arg2 + 0x250)

if (r8 s>= 1)
    if (zx.d(*(r7 + 0xb3d)) == 0)
        ascension::CPlayer::RemoveInsightCount(r6)
    else
        uint32_t r0_2 = zx.d(*(r7 + 0xb29))
        uint32_t r9_1 = r0_2
        
        if (r0_2 != 0)
            r9_1 = 8
        
        if (*(r7 + 0xb48) s<= 0 && (r0_2 == 0 || *(r7 + 0xb40) s< 1))
            ascension::CPlayer::RemoveInsightCount(r6)
        else
            int32_t r0_3 = *(arg2 + 0x254)
            void** r0_4 = operator new(0x29c)
            CGameStateOptions::CGameStateOptions(r0_4.b)
            *r0_4 = _vtable_for_ascensionrules::CStateMustPayResources + 8
            r0_4[0x93] = r6
            r0_4[0x94] = r0_3
            r0_4[0x95] = 0
            r0_4[0x96] = 0
            r0_4[0x97] = r8
            r0_4[0x98] = r9_1
            r0_4[0x99] = 8
            r0_4[0x9a] = 0
            r0_4[0x9b].b = 0
            CState::AddOwnedChild(arg2)
            CStateList::AppendState(arg2)
            
            if (*(r7 + 0x30) u<= 0x17)
                ascension::CPlayer::RemoveInsightCount(r6)

int32_t* result = *(arg2 + 0x258)

if (result != 0)
    void* r2_2 = result + *result + 4
    uint32_t r1_8 = zx.d(*r2_2)
    
    if (r1_8 u<= 7)
        *r2_2 = r1_8.b + 1
        result = &result[*result * 8 + r1_8]
        result[4] = r8

return result
