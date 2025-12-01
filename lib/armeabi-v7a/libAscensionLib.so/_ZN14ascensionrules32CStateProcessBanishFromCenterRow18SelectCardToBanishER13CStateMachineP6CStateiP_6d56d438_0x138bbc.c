// 函数: _ZN14ascensionrules32CStateProcessBanishFromCenterRow18SelectCardToBanishER13CStateMachineP6CStateiPj
// 地址: 0x138bbc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r6 = *(arg2 + 0x24c)
char* r5 = *(r6 + 4)
void* result = ascension::CWorld::GetCenterRowCard(r5)

if (result == 0)
    return result

core::CWorldBase::OutputMessageFormat(r5, "%s banishes %s from center row\n", r6 + 0x10, 
    *(result + 0xc) + 4)
int32_t* r0_3 = *(arg2 + 0x268)

if (r0_3 != 0)
    void* r2_2 = r0_3 + *r0_3 + 4
    uint32_t r1_2 = zx.d(*r2_2)
    
    if (r1_2 u<= 7)
        uint32_t r3_1 = zx.d(*(result + 8))
        *r2_2 = r1_2.b + 1
        r0_3[*r0_3 * 8 + r1_2 + 4] = r3_1

void** r0_6 = operator new(0x9c)
CState::CState()
*r0_6 = _vtable_for_ascensionrules::CStateProcessBanishSequence + 8
r0_6[0xc] = r6
r0_6[0xd] = result
r0_6[0xe] = 7
r0_6[0xf] = arg3
r0_6[0x10].b = 0
r0_6[0x11] = _vtable_for_ascension::CEventBanishCard + 8
r0_6[0x12] = 0x1d
r0_6[0x13] = 0
r0_6[0x24] = r6
r0_6[0x25] = 0
r0_6[0x26] = 0
CState::AddOwnedChild(arg2)
CStateList::AppendState(arg2)
uint32_t r1_6 = zx.d(*(arg2 + 0x261))
int32_t var_44

if (zx.d(*(arg2 + 0x258)) == 0)
    int32_t var_28_1 = 0
    
    if (r1_6 != 0)
        r1_6 = 1
    
    int32_t var_48_1 = 0
    var_44 = 0
else
    int32_t var_28 = 0
    
    if (r1_6 != 0)
        r1_6 = 1
    
    int32_t var_48 = 0
    var_44 = 1

ascensionrules::CreateStateRemoveCenterRowCard(r6, arg3, nullptr, true, false, var_44, 
    *(arg2 + 0x25c), r1_6.b, *(arg2 + 0x264), nullptr, 0, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
