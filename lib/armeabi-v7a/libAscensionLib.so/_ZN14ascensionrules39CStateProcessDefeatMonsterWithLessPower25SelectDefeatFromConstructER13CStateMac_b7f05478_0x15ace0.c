// 函数: _ZN14ascensionrules39CStateProcessDefeatMonsterWithLessPower25SelectDefeatFromConstructER13CStateMachineP6CStateiPj
// 地址: 0x15ace0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg3 + 0x4c)
uint32_t r5 = *(result - 4)

if (r5 != 0)
    core::CCardInstance* r9_1 = *(arg2 + 0x24c)
    char* r0 = *(r9_1 + 4)
    uint32_t var_28_1 = r0
    core::CWorldBase::OutputMessageFormat(r0, "%s defeats %s\n", r9_1 + 0x10, *(r5 + 0xc) + 4)
    uint32_t r6_1 = zx.d(*(arg2 + 0x256))
    bool r10_1 = *(arg2 + 0x258)
    uint32_t r8_1 = zx.d(*(r9_1 + 8))
    ascension::CPlayer* r0_1 = operator new(0x99c)
    bool r2_1 = true
    
    if (r6_1 == 0)
        r2_1 = true
    
    int32_t var_30_1 = 0
    ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(r0_1, 
        r9_1, r5, 4, r8_1, r2_1, r10_1, true)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    int32_t* r0_5 = *(arg2 + 0x260)
    
    if (r0_5 != 0)
        void* r2_4 = r0_5 + *r0_5 + 4
        uint32_t r1_4 = zx.d(*r2_4)
        
        if (r1_4 u<= 7)
            uint32_t r3_2 = zx.d(*(r5 + 8))
            *r2_4 = r1_4.b + 1
            r0_5[*r0_5 * 8 + r1_4 + 4] = r3_2
    
    result = *(arg2 + 0x25c)
    
    if (result != 0 && zx.d(*(var_28_1 + 0xa14)) == 0)
        uint32_t var_40_2 = zx.d(*(result + 8))
        return ascension::CWorld::OutputEvent(var_28_1, 0x15, zx.d(*(r9_1 + 8)), zx.d(*(r5 + 8)))

return result
