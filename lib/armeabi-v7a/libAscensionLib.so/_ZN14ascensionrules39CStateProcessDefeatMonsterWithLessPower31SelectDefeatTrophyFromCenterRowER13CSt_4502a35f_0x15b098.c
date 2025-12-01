// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower31SelectDefeatTrophyFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x15b098
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r9 = *(arg2 + 0x24c)
char* r8 = *(r9 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r8)

if (result != 0)
    uint32_t result_1 = result
    core::CWorldBase::OutputMessageFormat(r8, "%s defeats %s\n", r9 + 0x10, *(result + 0xc) + 4)
    int32_t var_28_1 = 0
    ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
        operator new(0x99c), r9, result_1, 7, arg3, true, false, true)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    int32_t* r0_7 = *(arg2 + 0x260)
    
    if (r0_7 != 0)
        void* r2_3 = r0_7 + *r0_7 + 4
        uint32_t r1_5 = zx.d(*r2_3)
        
        if (r1_5 u<= 7)
            uint32_t r3_1 = zx.d(*(result_1 + 8))
            *r2_3 = r1_5.b + 1
            r0_7[*r0_7 * 8 + r1_5 + 4] = r3_1
    
    result = *(arg2 + 0x25c)
    
    if (result != 0 && zx.d(r8[0xa14]) == 0)
        uint32_t var_38_2 = zx.d(*(result + 8))
        return ascension::CWorld::OutputEvent(r8, 0x15, zx.d(*(r9 + 8)), zx.d(*(result_1 + 8)))

return result
