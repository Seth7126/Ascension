// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower38SelectDefeatFromCenterRowToDiscardPileER13CStateMachineP6CStateiPj
// 地址: 0x15b55c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r9 = *(arg2 + 0x24c)
char* r8 = *(r9 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r8)

if (result != 0)
    uint32_t result_1 = result
    core::CWorldBase::OutputMessageFormat(r8, "%s defeats %s\n", r9 + 0x10, *(result + 0xc) + 4)
    
    if (*(r8 + 0x30) u< 2)
        ascensionrules::CreateStateRemoveCenterRowCard(r9, arg3, nullptr, false, true, 0, 0, false, 
            nullptr, nullptr, 0, nullptr, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        ascension::CPlayer* r5_1 = operator new(0xb0)
        CStateList::CStateList()
        *r5_1 = _vtable_for_ascensionrules::CStateProcessDefeatMonster + 8
        *(r5_1 + 0x38) = r9
        *(r5_1 + 0x3c) = result_1
        *(r5_1 + 0x40) = arg3
        *(r5_1 + 0x44) = _vtable_for_ascension::CEventDefeatMonster + 8
        *(r5_1 + 0x48) = 0x1b
        *(r5_1 + 0x4c) = 0
        *(r5_1 + 0x90) = 0
        *(r5_1 + 0x94) = 0
        *(r5_1 + 0x98) = 0
        *(r5_1 + 0x9c) = 0xffffffff
        *(r5_1 + 0xa0) = 0
        *(r5_1 + 0xa4) = 0
        *(r5_1 + 0xa8) = 1
        *(r5_1 + 0xaf) = 0
        *(r5_1 + 0xad) = 0
        *(r5_1 + 0xa9) = 0
    else
        int32_t var_38_1 = 0
        ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
            operator new(0x99c), r9, result_1, 7, arg3, true, false, true)
    
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    int32_t* r0_14 = *(arg2 + 0x260)
    
    if (r0_14 != 0)
        void* r2_3 = r0_14 + *r0_14 + 4
        uint32_t r1_9 = zx.d(*r2_3)
        
        if (r1_9 u<= 7)
            uint32_t r3_1 = zx.d(*(result_1 + 8))
            *r2_3 = r1_9.b + 1
            r0_14[*r0_14 * 8 + r1_9 + 4] = r3_1
    
    result = *(arg2 + 0x25c)
    
    if (result != 0 && zx.d(r8[0xa14]) == 0)
        uint32_t var_48_2 = zx.d(*(result + 8))
        return ascension::CWorld::OutputEvent(r8, 0x15, zx.d(*(r9 + 8)), zx.d(*(result_1 + 8)))

return result
