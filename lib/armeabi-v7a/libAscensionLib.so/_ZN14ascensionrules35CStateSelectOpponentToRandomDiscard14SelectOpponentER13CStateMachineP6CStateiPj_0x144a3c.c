// 函数: _ZN14ascensionrules35CStateSelectOpponentToRandomDiscard14SelectOpponentER13CStateMachineP6CStateiPj
// 地址: 0x144a3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = *(arg2 + 0x24c)
char* r8 = r7[1]
int32_t* r0_1 = core::CWorldBase::GetInstanceByID(r8)
void** r0_2 = operator new(0x34)
CState::CState()
r0_2[0xc] = r0_1
*r0_2 = _vtable_for_ascensionrules::CStateProcessDiscardRandomCard + 8
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
core::CWorldBase::OutputMessageFormat(r8, "%s forces %s to randomly discard 1 card\n", 
    (*(*r7 + 0xc))(r7), (*(*r0_1 + 0xc))(r0_1))
int32_t* result = *(arg2 + 0x250)

if (result != 0)
    void* r2_2 = result + *result + 4
    uint32_t r1_6 = zx.d(*r2_2)
    
    if (r1_6 u<= 7)
        uint32_t r3_1 = zx.d(r0_1[2].w)
        *r2_2 = r1_6.b + 1
        result = &result[*result * 8 + r1_6]
        result[4] = r3_1

return result
