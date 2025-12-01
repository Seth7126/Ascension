// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow25SelectDefeatFromConstructER13CStateMachineP6CStateiPj
// 地址: 0x12fc7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg3 + 0x4c)
int32_t* r5 = *(result - 4)

if (r5 == 0)
    return result

ascension::CPlayer* r6 = *(arg2 + 0x24c)
core::CWorldBase::OutputMessageFormat(*(r6 + 4), "%s defeats %s\n", r6 + 0x10, (*(*r5 + 0xc))(r5))
int32_t r0_4 = *(arg2 + 0x6cc)

if (r0_4 s>= 1)
    int32_t r1_1 = 0
    
    do
        if (*(arg2 + 0x6e0 + (r1_1 << 2) - 0x10) == arg3)
            *(arg2 + r1_1 + 0x6e0) = 1
            break
        
        r1_1 += 1
    while (r1_1 s< r0_4)

*(arg2 + 0x680) += 1
ascensionrules::CreateStateProcessDefeatMonsterSequence(r6, r5, 4, zx.d(*(r6 + 8)), 9, false, 
    false, false, nullptr, 0)
return CStateMachine::PushState(arg1) __tailcall
