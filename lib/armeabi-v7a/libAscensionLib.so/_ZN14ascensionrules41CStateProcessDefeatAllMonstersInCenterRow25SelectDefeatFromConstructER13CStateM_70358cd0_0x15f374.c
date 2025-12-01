// 函数: _ZN14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow25SelectDefeatFromConstructER13CStateMachineP6CStateiPj
// 地址: 0x15f374
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg3 + 0x4c)
int32_t* r5 = *(result - 4)

if (r5 == 0)
    return result

core::CCardInstance* r9 = *(arg2 + 0x24c)
core::CWorldBase::OutputMessageFormat(*(r9 + 4), "%s defeats %s\n", r9 + 0x10, (*(*r5 + 0xc))(r5))
int32_t r0_4 = *(arg2 + 0x4bc)

if (r0_4 s>= 1)
    int32_t r1_1 = 0
    
    do
        if (*(arg2 + 0x4d0 + (r1_1 << 2) - 0x10) == arg3)
            *(arg2 + r1_1 + 0x4d0) = 1
            break
        
        r1_1 += 1
    while (r1_1 s< r0_4)

*(arg2 + 0x490) += 1
int32_t var_28 = 0
ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
    operator new(0x99c), r9, r5, 4, zx.d(*(arg3 + 8)), true, false, false)
return CStateMachine::PushState(arg1) __tailcall
