// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower31SelectDefeatTrophyFromConstructER13CStateMachineP6CStateiPj
// 地址: 0x15ae28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg3 + 0x4c)
uint32_t r5 = *(result - 4)

if (r5 != 0)
    core::CCardInstance* r9_1 = *(arg2 + 0x24c)
    uint32_t r8_1 = *(r9_1 + 4)
    core::CWorldBase::OutputMessageFormat(r8_1, "%s defeats %s\n", r9_1 + 0x10, *(r5 + 0xc) + 4)
    int32_t var_28_1 = 0
    ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
        operator new(0x99c), r9_1, r5, 4, zx.d(*(r9_1 + 8)), true, false, true)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    int32_t* r0_6 = *(arg2 + 0x260)
    
    if (r0_6 != 0)
        void* r2_3 = r0_6 + *r0_6 + 4
        uint32_t r1_4 = zx.d(*r2_3)
        
        if (r1_4 u<= 7)
            uint32_t r3_1 = zx.d(*(r5 + 8))
            *r2_3 = r1_4.b + 1
            r0_6[*r0_6 * 8 + r1_4 + 4] = r3_1
    
    result = *(arg2 + 0x25c)
    
    if (result != 0 && zx.d(*(r8_1 + 0xa14)) == 0)
        uint32_t var_38_2 = zx.d(*(result + 8))
        return ascension::CWorld::OutputEvent(r8_1, 0x15, zx.d(*(r9_1 + 8)), zx.d(*(r5 + 8)))

return result
